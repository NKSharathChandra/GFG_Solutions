class Solution{//we need to find maxSum of root to leaf having maxHeight 
    class Result{
        int maxHeight;
        int maxSum;
        Result(int height, int sum){
            this.maxHeight = height;
            this.maxSum = sum;
        }
    }
    public Result findMaxHeightWithSum(Node root){
        if(root == null){
            return new Result(0,0);
        }
        Result leftResult = findMaxHeightWithSum(root.left);//get leftResult
        Result rightResult = findMaxHeightWithSum(root.right);//get rightResult
        
        int currHeight = 1 + Math.max(leftResult.maxHeight, rightResult.maxHeight);//currHeight = 1 + maxOf(leftHeight, rightHeight)
        int currSum = root.data;
        if(leftResult.maxHeight > rightResult.maxHeight){//if leftResult's height is > rightResultHeight, currSum will take leftResult's sum
            currSum += leftResult.maxSum;
        }else if(leftResult.maxHeight < rightResult.maxHeight){//if rightResult's height is > leftResultHeight, currSum will take rightResult's sum
            currSum += rightResult.maxSum;
        }else{//if result's, leftHeight == rightHeight then take max of leftResult's sum & rightResult's sum
            currSum += Math.max(leftResult.maxSum, rightResult.maxSum);
        }
        // take leftResult.maxSum else rightResult.maxSum
        return new Result(currHeight, currSum);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {//find the sum on longest path, 2 paths same so get max of both of them
        Result maxBoth = findMaxHeightWithSum(root);
        return maxBoth.maxSum;
    }
}
