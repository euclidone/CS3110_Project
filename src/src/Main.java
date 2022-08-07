//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Main {
    public static void main(String[] args) {
        universalFA m1 = new universalFA();
        State m1s1 = new State(0);
        State m1s2 = new State(1);
        State m1s3 = new State(2);
        State[] m1States = {m1s1, m1s2, m1s3};
        boolean[] m1FinalStates = {true, true, false};
        char[] m1Alphabet = {'0', '1'};
        int[][] m1Table = {{0, 1}, {0, 2}};
        int[][] m1TransTable = {{0,0,1},{0,1,2},{1,0,1},{1,1,2},{2,1,2},{2,0,0}};

        String[] m1Test = {"?", "100?", "011?", "10abc1?", "0?", "1?", "0101011?", "11010?", "0001?", "1110?"};
        String[] m1TestDisplay = {"Λ", "100", "011", "10abc1", "0", "1", "0101011", "11010", "0001", "1110"};

        String[] m1AdditionalTest = {"0?", "001?", "121?", "111101?", "x?", "1+?", "0001110?", "01010101010?", "1011111?", "0101110?"};
        String[] m1AdditionalTestDisplay = {"0", "001", "121", "111101", "x", "1+", "0001110", "01010101010", "1011111", "0101110"};

        System.out.println("Finite State Automaton #1");
        System.out.println("1) Number of states: 3");
        System.out.println("2) Final states: 0, 1");
        System.out.println("3) Alphabet: Λ, 1, 000, 101, 111, 01001, 1011011, 1011000, 01010, 1010101110");
        System.out.print("4) Transitions: \n");

        for (int i = 0; i < m1TransTable.length; i++){
            for (int j = 0; j < m1TransTable.length - 3; j++){
                System.out.print("\t" + m1TransTable[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("5) Strings: ");
        for (int i = 0; i < m1Test.length; i++) {
            System.out.print("\n\t" + m1TestDisplay[i] + " ");
            if (!m1.generalTransitionAlgorithm(m1States, m1FinalStates,
                    m1Alphabet, m1Table, m1Test[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }
        System.out.print("\n6) Additional Strings: ");
        for (int i = 0; i < m1AdditionalTest.length; i++) {
            System.out.print("\n\t" + m1AdditionalTestDisplay[i] + " ");
            if (!m1.generalTransitionAlgorithm(m1States, m1FinalStates,
                    m1Alphabet, m1Table, m1AdditionalTest[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }

        universalFA m2 = new universalFA();
        State m2s1 = new State(0);
        State m2s2 = new State(1);
        State m2s3 = new State(2);
        State[] m2States = {m2s1, m2s2, m2s3};
        boolean[] m2FinalStates = {true, false};
        char[] m2Alphabet = {'0', '1'};
        int[][] m2Table = {{0, 1}, {0, 1}};
        int[][] m2TransTable = {{0,0,0},{0,1,1},{1,0,0},{1,1,1}};

        String[] m2Test = {"?", "1?", "000?", "101?", "111?", "01001?", "1011011?", "1011000?", "01010?", "1010101110?"};
        String[] m2TestDisplay = {"Λ", "1", "000", "101", "111", "01001", "1011011", "1011000", "01010", "1010101110"};

        String[] m2AdditionalTest = {"0?", "010?", "110?", "10101?", "10000111?", "1110111?", "11111?", "000000?",
                "01101101?", "010101010101010101?"};
        String[] m2AdditionalTestDisplay = {"0", "010", "110", "10101", "10000111", "1110111", "11111", "000000",
                "01101101", "010101010101010101"};

        System.out.println("\n");
        System.out.println("Finite State Automaton #2");
        System.out.println("1) Number of states: 3");
        System.out.println("2) Final states: 1");
        System.out.println("3) Alphabet: 0, 1");
        System.out.print("4) Transitions: \n");
        for (int i = 0; i < m2TransTable.length; i++) {
            for (int j = 0; j < m2TransTable.length - 1; j++) {
                System.out.print("\t" + m2TransTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("5) Strings: ");
        for (int i = 0; i < m2Test.length; i++) {
            System.out.print("\n\t" + m2TestDisplay[i] + " ");
            if (!m2.generalTransitionAlgorithm(m2States, m2FinalStates,
                    m2Alphabet, m2Table, m2Test[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }
        System.out.print("\n6) Additional Strings: ");
        for (int i = 0; i < m2AdditionalTest.length; i++) {
            System.out.print("\n\t" + m2AdditionalTestDisplay[i] + " ");
            if (!m2.generalTransitionAlgorithm(m2States, m2FinalStates,
                    m2Alphabet, m2Table, m2AdditionalTest[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }

        universalFA m3 = new universalFA();
        State m3s1 = new State(0);
        State m3s2 = new State(1);
        State m3s3 = new State(2);
        State[] m3States = {m3s1, m3s2, m3s3};
        boolean[] m3FinalStates = {false, true, false};
        char[] m3Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G'
                , 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
                'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        int[][] m3Table = {{1, 2}, {1, 1}};

        String[][] m3TransTable = {{"0","L","1"},{"1","L","1"},{"1", "D", "1"},{"0","D","2"},{"2","L","2"},{"2","D","2"}};
        String[] m3Test = {"?", "HelloWorld?", "abc?", "1st_Ex?", "Java?", "_finite_automaton?", "program?", "X3Y7?",
                "X=90?", "X*Y?"};
        String[] m3TestDisplay = {"Λ",  "HelloWorld", "abc", "1st_Ex", "Java", "_finite_automaton", "program",
                "X3Y7", "X=90", "X*Y"};

        String[] m3AdditionalTest = {"abc/?", "4234?", "nfv32?", "sjfre.?", "python?", "automata_?", "JelaKc?", "J9J91?",
                "0987uyjk?", "9nu7j98?"};
        String[] m3AdditionalTestDisplay = {"abc/", "4234", "nfv32", "sjfre.", "python", "automata_", "JelaKc", "J9J91",
                "0987uyjk", "9nu7j98"};

        System.out.println("\n");
        System.out.println("Finite State Automaton #3");
        System.out.println("1) Number of states: 3");
        System.out.println("2) Final state: 2");
        System.out.println("3) Alphabet: [a-zA-Z], [0-9]");
        System.out.print("4) Transitions: \n");
        for (int i = 0; i < m3TransTable.length; i++){
            for (int j = 0; j < m3TransTable.length - 3; j++){
                System.out.print("\t" + m3TransTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("5) Strings: ");
        for(int i = 0; i < m3Test.length; i++)
        {
            System.out.print("\n\t" + m3TestDisplay[i] + " ");
            if(!m3.generalTransitionAlgorithm(m3States, m3FinalStates,
                    m3Alphabet, m3Table, m3Test[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }
        System.out.print("\n6) Strings: ");
        for(int i = 0; i < m3AdditionalTest.length; i++)
        {
            System.out.print("\n\t" + m3AdditionalTestDisplay[i] + " ");
            if(!m3.generalTransitionAlgorithm(m3States, m3FinalStates,
                    m3Alphabet, m3Table, m3AdditionalTest[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }

        universalFA m4 = new universalFA();
        State m4s1 = new State(0);
        State m4s2 = new State(1);
        State m4s3 = new State(2);
        State m4s4 = new State(3);
        State[] m4States = {m4s1, m4s2, m4s3, m4s4};
        boolean[] m4FinalStates = {false, true, true, false};
        char[] m4Alphabet = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[][] m4Table = {{2, 1}, {1, 1}, {3, 3}};


        String[] m4Test = {"2?", "-7?", "007?", "3.14?", "103?", "24930000?", "0?", "01?", "100?", "0101?"};
        String[] m4TestDisplay = {"2", "-7", "007", "3.14", "103", "24930000", "0", "01", "100", "0101"};

        String[] m4AdditionalTest = {"a?", "-11?", "166?", "1.97?", "420?", "4324535646?", "0-?", "0.1?", "898?", "1234567890?"};
        String[] m4AdditionalTestDisplay = {"a", "-11", "166", "1.97", "420", "4324535646", "0-", "0.1", "898", "1234567890"};

        System.out.println("\n");
        System.out.println("Finite State Automaton #4");
        System.out.println("1) Number of states: 4");
        System.out.println("2) Final states: 2, 3");
        System.out.println("3) Alphabet: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        System.out.print("4) Transitions: \n");
        for (int i = 0; i < m4Table.length; i++){
            for (int j = 0; j < m4Table.length-1; j++){
                System.out.print("\t" + m4Table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("5) Strings: ");
        for(int i = 0; i < m4Test.length; i++)
        {
            System.out.print("\n\t" + m4TestDisplay[i] + " ");
            if(!m4.generalTransitionAlgorithm(m4States, m4FinalStates,
                    m4Alphabet, m4Table, m4Test[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }
        System.out.print("\n6) Strings: ");
        for(int i = 0; i < m4AdditionalTest.length; i++)
        {
            System.out.print("\n\t" + m4AdditionalTestDisplay[i] + " ");
            if(!m4.generalTransitionAlgorithm(m4States, m4FinalStates,
                    m4Alphabet, m4Table, m4AdditionalTest[i]))
                System.out.print("Reject");
            else
                System.out.print("Accept");
        }
    }
}