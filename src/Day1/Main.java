package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> inputValues = getInputValues();

        //Actual code (I know its bad I just did it to be fast)
        int increase = 0;
        int beforeInt = inputValues.get(0) + inputValues.get(1) + inputValues.get(2);

        for(int i = 1; i < inputValues.size()-2; i++){
            if(inputValues.get(i) + inputValues.get(i+1) + inputValues.get(i+2) > beforeInt){
                increase++;
            }
            beforeInt = inputValues.get(i) + inputValues.get(i+1) + inputValues.get(i+2);
        }

        System.out.println(increase);
    }
    
    public static ArrayList<Integer> getInputValues() throws IOException {
        ArrayList<Integer> inputValues = new ArrayList<>();
        BufferedReader textReader = new BufferedReader(new FileReader("C:\\Users\\Windows\\IdeaProjects\\AdventCode\\src\\Day1\\input.txt"));

        try {
            String line = textReader.readLine();

            while (line != null) {
                inputValues.add(Integer.parseInt(line.strip()));
                line = textReader.readLine();
            }
        } catch (Exception e){
            System.err.println("Error reading code: "+e.getMessage());
        }
        finally {
            textReader.close();
        }
    }
}
