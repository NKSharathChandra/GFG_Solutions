class Solution {
    static int swapNibbles(int n) {
        // Right shift the input by 4 bits to move the higher nibble to the lower nibble position.
        int rightShifted = n >> 4;
        
        // Mask the lower 4 bits (nibble) of the input and then left shift by 4 bits
        // to move the lower nibble to the higher nibble position.
        int leftShifted = (n & 0x0F) << 4;
        
        // Combine the shifted nibbles using bitwise OR operation to get the result.
        return rightShifted | leftShifted;
    }
}
