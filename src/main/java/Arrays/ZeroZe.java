package Arrays;

public class ZeroZe {
        public void moveZeroes(int[] nums) {
            int w = 0; // write pointer

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int t = nums[w];
                    nums[w] = nums[i];
                    nums[i] = t;
                    w++;
                }
            }
        }

        public static void main(String[] args) {
            ZeroZe m = new ZeroZe();
            int[] nums = {0, 1, 0, 3, 12};
            m.moveZeroes(nums);

            for (int x : nums) {
                System.out.print(x + " ");
            }
            // Ожидается: 1 3 12 0 0
        }
    }


