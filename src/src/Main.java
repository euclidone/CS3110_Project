import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Main {
    public static void main(String[] args) {
        universalFA ufa = new universalFA();
        State stateOne = new State(0);
        State stateTwo = new State(1);
        State stateThree = new State(2);
        State deadState = new State(3);
        State[] setOfStates = {stateOne, stateTwo, stateThree, deadState};
        boolean[] finalStates = {false, true, true, false};
        char[] alphabetArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[][] transitionTable = {{2, 1}, {1, 1}, {3, 3}};
        // for some reason it is saying false when it starts with 1 but any other number it says true


        String[] array = {"2?", "-7?", "007?", "3.14?", "103?", "24930000?", "0?", "01?", "100?", "0101?"};
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + " : " + ufa.generalTransitionAlgorithm(setOfStates, finalStates,
                    alphabetArray, transitionTable, array[i]));

        }
        //System.out.println(ufa.generalTransitionAlgorithm(setOfStates, finalStates,
        //alphabetArray, transitionTable, "24930000?"));



    }
}