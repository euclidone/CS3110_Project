public class universalFA {

    public boolean generalTransitionAlgorithm(State[] setOfStates,  boolean[] finalStates, char[] alphabetArray,
                                              int[][] transitionTable, String testString) {
        State currentState = setOfStates[0]; // Setting the initial state as the current state
        boolean exit = false;
        char[] testStringArray = testString.toCharArray(); // Making the test string into a character array
        int index = 0; // keep track of which symbol in testStringArray is being currently used
        char endMarker = '?'; // Symbol used to mark the end of the string
        int statesLength = setOfStates.length;



        while(!exit) {
            char currentSymbol = nextSymbol(testStringArray, index);
            if(contains(alphabetArray, currentSymbol)) { // Check if the symbol is in the alphabet
                currentState = nextState(currentState, currentSymbol, transitionTable, setOfStates);
                if(currentState == setOfStates[statesLength - 1]) { // Checking if the current state is the dead state
                    exit = true;
                    return false;
                }

            }
            else {
                exit = true;
                if(currentSymbol != endMarker) {
                    return false;
                }
                else if(finalStates[currentState.getStateNumber()]) { // checking if the current state is a final state
                    return true;
                }
                else {
                    return false;
                }
            }
            index++;
        }

        return true;
    }

    public char nextSymbol(char[] characterArray, int inputIndex) {


        return  characterArray[inputIndex]; //
    }

    public boolean contains(char[] alphabetArray, char symbol) {
        for(int i = 0; i < alphabetArray.length; i++ ) {
            if(alphabetArray[i] ==  symbol) {
                return true;
            }

        }
        return false;
    }

    public State nextState(State currentState, char currentSymbol, int[][] transitionTable, State[] setOfStates) {
        // This section is experimental but the only thing needed for the first 2 cases is the value 48 instead of the
        // asciiSubtractorValue variable
        int asciiSubtractorValue = 0;
        if(currentSymbol - 48 >= 0 && currentSymbol - 48 <= 9) { // symbol is a digit
            asciiSubtractorValue = 48;
        }
        else if(currentSymbol - 48 >= 17 && currentSymbol - 48 <= 42) { // symbol is an uppercase letter
            asciiSubtractorValue = 65;
        }
        else if(currentSymbol - 48 >= 49 && currentSymbol - 48 <= 74) { // symbol is a lowercase letter
            asciiSubtractorValue = 97;
        }

        return setOfStates[transitionTable[currentState.getStateNumber()][currentSymbol - asciiSubtractorValue]];



    }

}



