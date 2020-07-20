package com.company;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if((bigCount * 5) + smallCount < goal){
            return false;
        } else if ((bigCount * 5) + smallCount == goal) {
            return true;
        }

        int totalCount = 0;
        if(smallCount == 0) {
            for (int i = 0; i < bigCount; i++){
                totalCount += 5;
                if (totalCount == goal){
                    return true;
                }
            }
            return false;
        } else if (bigCount == 0){
            for (int i = 0; i < smallCount; i++){
                totalCount ++;
                if (totalCount == goal){
                    return true;
                }
            }
            return false;
        } else {
            for(int i = 0; i <= bigCount; i++){
                for(int j = 0; j <= smallCount; j++){
                    if((i * 5) + j == goal){
                        return true;
                    }
                }
            }
            return false;
        }


    }
}
