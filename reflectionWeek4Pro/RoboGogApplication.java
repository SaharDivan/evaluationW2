package reflectionWeek4Pro;

import exe9.FileReader;

import java.util.*;

public class RoboGogApplication {

    public static void main(String[] args) {
       /* Exe1*/
        FileReader reader=new FileReader();
        List<String> lineList = reader.asLine("reflectionWeek4Pro/robodog.txt");
        Set<String>  lineSet=new HashSet<>();
        for (String line:lineList) {

            String decrypted=line.replaceAll("!","");
            lineList.add(decrypted);
            lineSet.add(decrypted);
        }
        System.out.println("The number of commands are: "+lineSet.size());
        System.out.println(lineSet);
        /*Exe2*/
        Map<String,Integer> commandFrequency=new HashMap<>();
        for (int i=0; i<lineList.size();i++) {
            String line = lineList.get(i);
            Integer frequency=0;
            for (String lineL:lineList) {
                if(lineL.equals(line)){frequency++;}
            }
            commandFrequency.put(line,frequency);

            Command mostFrequent= findTheMostFrequentCommand(commandFrequency);
            System.out.println("The most frequently used command is: "+mostFrequent.toString());
        }
    }


    private static Command findTheMostFrequentCommand(Map<String,Integer> commandFrequency) {
        List<Command> commands=new ArrayList<>();
        Collection<String> values = commandFrequency.keySet();
        for (String value:values) {
            commands.add(new Command(value,commandFrequency.get(value)));
        }
        commands.sort(Comparator.comparing(Command::getFrequency).reversed());
        return commands.get(0);
    }
}
