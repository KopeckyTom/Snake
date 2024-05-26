import javax.swing.*;
import java.io.*;
import java.util.*;

public class FileRW {
    private static final String FILENAME = "scoreboard.txt";
    List<Integer> allScores = new ArrayList<>();

    public void writeScore(int score) {
        try (FileWriter fw = new FileWriter(FILENAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(score);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setScore(JLabel label){

        label.setText("record: " + getMaxScore());

    }

    public int getMaxScore() {
        int maxScore = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(new File(FILENAME))) {
            while (scanner.hasNextInt()) {
                int currentScore = scanner.nextInt();
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return maxScore;
    }

    public java.util.List<Integer> getAllScoresArray() {
        allScores = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(FILENAME))) {
            while (scanner.hasNextInt()) {
                int currentScore = scanner.nextInt();
                allScores.add(currentScore);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(allScores,Collections.reverseOrder());
        List<Integer> allFinalScores = removeDuplicates((ArrayList<Integer>) allScores);
        return allFinalScores;
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public String first(){

        ArrayList<Integer> list = new ArrayList<>(getAllScoresArray());
        removeDuplicates(list);
        return "1st: " + list.get(0);

    }

    public String second(){

        ArrayList<Integer> list = new ArrayList<>(getAllScoresArray());
        removeDuplicates(list);
        return "2nd: " + list.get(1);

    }
    public String thrid(){

        ArrayList<Integer> list = new ArrayList<>(getAllScoresArray());
        removeDuplicates(list);
        return "3rd: " + list.get(2);


    }
    public String fourth(){

        ArrayList<Integer> list = new ArrayList<>(getAllScoresArray());
        removeDuplicates(list);
        return "4th: " + list.get(3);

    }
    public String fifth(){

        ArrayList<Integer> list = new ArrayList<>(getAllScoresArray());
        removeDuplicates(list);
        return "5th: " + list.get(4);

    }




}
