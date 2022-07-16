public class universalFA {
    public boolean reject() {
        return false;
    }

    public boolean accept() {
        return true;
    }

    public boolean generalTransitionAlgorithm(State[] setOfStates, final boolean[] finalStates, char[] alphabetArray,
                                              int[][] transitionTable) {
        State currentState = setOfStates[0]; // Setting the initial state as the current state

        boolean exit = false;

        while(exit) {
            Symbol currentSymbol = nextSymbol();
            if(alphabetArray.contains(symbol)) {
                currentState = nextState(currentState, currentSymbol);
                if(currentState == setOfStates[n]) {
                    exit = true;
                    reject();
                }
                else {
                    exit = true;
                    if(currentSymbol != setOfStates[n]) {
                        reject();
                    }
                    else if(finalStates[currentState.getStateNumber()]) {
                        accept();
                    }
                    else {
                        reject();
                    }
                }
            }
        }

    }
}

