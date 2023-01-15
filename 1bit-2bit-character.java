//1-bit and 2-bit Characters

class Solution {
  public boolean isOneBitCharacter(int[] bits) {
    int idx = 0;
    while (idx < bits.length - 1) {
      if (bits[idx] != 0) {
        idx++;
      }
      idx++;
    }
    return idx == bits.length - 1;
  } 
}