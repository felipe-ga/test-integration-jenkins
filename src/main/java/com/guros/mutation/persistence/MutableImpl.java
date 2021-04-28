package com.guros.mutation.persistence;

import com.guros.mutation.persistence.interfacerepository.Mutable;
import org.springframework.stereotype.Repository;

@Repository
public class MutableImpl implements Mutable {

    @Override
    public boolean hasMutable(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length(); j++) {
                //Horizontal
                if(j + 3 < dna[i].length()){
                    if(checkHorizontal(dna[i].substring(j,j+4),dna[i].charAt(j)) == 4){
                        return true;
                    }
                }
                //Vertical
                if(i + 3 < dna.length){
                    if(checkVertical(i,i + 3,dna,dna[i].charAt(j)) == 4){
                        return true;
                    }
                }
                //Oblicuo
                if(checkOblicuo(dna,dna[i].charAt(j),i,j) == 4){
                    return true;
                }
            }
        }
        return false;
    }

    private int checkOblicuo(String[] array,char character,int row,int col){
        int characterRepeated = 1;
        int[] dr = {0,1,1};
        int[] dc = {1,0,1};
        for (int i = 0; i < dr.length; i++) {
            int rr = row + dr[i];
            int cc = col + dc[i];
            if(rr < 0 || cc < 0){
                continue;
            }
            if(rr >= array.length || cc >= array.length){
                continue;
            }
            if(array[rr].charAt(cc) == character){
                characterRepeated++;
            }
        }
        return characterRepeated;
    }

    private int checkVertical(int indexStart,int indexEnd,String[] array,char character){
        int characterRepeated = 1;
        for (int i = indexStart; i < indexEnd; i++) {
            if(character == array[i].charAt(0)){
                characterRepeated++;
            }
        }
        return characterRepeated;
    }

    private int checkHorizontal(String string,char character){
        int characterRepeated = 0;
        for (int i = 0; i < string.length(); i++) {
            if(character == string.charAt(i)){
                characterRepeated++;
            }
        }

        return characterRepeated;
    }
}
