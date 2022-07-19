import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Main {
    public static void main(String[] args) {
        universalFA ufa = new universalFA();
        State stateOne = new State(0);
        State stateTwo = new State(1);
        State deadState = new State(2);
        State[] setOfStates = {stateOne, stateTwo, deadState};
        boolean[] finalStates = {true, true, false};
        char[] alphabetArray = {'0', '1'};
        int[][] transitionTable = {{0, 1}, {0, 2}};



        System.out.println(ufa.generalTransitionAlgorithm(setOfStates, finalStates,
                alphabetArray, transitionTable, "10101010?"));


    }
}