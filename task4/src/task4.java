import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) throws Exception {

        List<Integer> nums = new ArrayList<Integer>();

        File file = new File("/project-test/task4/src/fileArr.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                int tempNum = Integer.parseInt(line);
                nums.add(tempNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  

        nums.stream().sorted();
        int mid = Math.floorDiv(nums.size(), 2);
        int result = 0;
        for (Integer number : nums) {
            result += Math.abs(number - nums.get(mid)); 
        }

        System.out.println(result);
    }
}
