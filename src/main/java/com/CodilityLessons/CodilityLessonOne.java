package main.java.com.CodilityLessons;

public class CodilityLessonOne {
    public int binaryGap(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);
        return this.calculateGap(binaryRepresentation);
    }

    private int calculateGap(String binaryString){
        int newBinaryGap = 0;
        int binaryGap = 0;
        for(char ch : binaryString.toCharArray()){
            if('0' == ch){
                newBinaryGap++;
            } else if('1' == ch){

                if(newBinaryGap > binaryGap) {
                    binaryGap = newBinaryGap;
                    newBinaryGap = 0;
                }
            }
        }

        return binaryGap;
    }
}
