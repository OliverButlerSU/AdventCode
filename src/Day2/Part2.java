package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Part2 {
    public static void main(String args[]) throws IOException {
        int forward = 0;
        int aim = 0;
        int depth = 0;

        ArrayList<String[]> inputValues = getInputValues();
        for(int i = 0; i < inputValues.size(); i++){
            switch(inputValues.get(i)[0]){
                case "forward":
                    forward += Integer.parseInt(inputValues.get(i)[1]);
                    depth += aim* Integer.parseInt(inputValues.get(i)[1]);
                    break;
                case "down":
                    aim+=Integer.parseInt(inputValues.get(i)[1]);
                    break;
                case "up":
                    aim-=Integer.parseInt(inputValues.get(i)[1]);
            }
        }

        System.out.println(depth * forward);


    }

    public static ArrayList<String[]> getInputValues() throws IOException {
        ArrayList<String[]> inputValues = new ArrayList<>();
        BufferedReader textReader = new BufferedReader(new FileReader("C:\\Users\\Windows\\IdeaProjects\\AdventCode\\src\\Day2\\input.txt"));

        try {
            String line = textReader.readLine();

            while (line != null) {
                inputValues.add(line.strip().split(" "));
                line = textReader.readLine();
            }
        } catch (Exception e){
            System.err.println("Error reading code: "+e.getMessage());
        }
        finally {
            textReader.close();
        }

        return inputValues;
    }
}
