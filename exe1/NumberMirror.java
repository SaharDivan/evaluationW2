package evaluationW3.exe1;

import java.util.ArrayList;
import java.util.List;

public class NumberMirror {

    public Integer mirror(Integer num){

       List<Integer> mirrorList=reversList(num);

        return listToInt(mirrorList);

    }

    public Integer specialMirror(Integer num){

        List<Integer> mirrorList=reversList(num);
        List<Integer> specialMirrorList= add1ToList(mirrorList);

        return listToInt(specialMirrorList);
    }

    private List<Integer> add1ToList(List<Integer> mirrorList) {

        List<Integer> specialMirrorList=new ArrayList<>();

        for (Integer digit:mirrorList
             ) {

            if(digit!=9){
                digit=digit+1;}
            else{
                digit=digit+0;}

                specialMirrorList.add(digit);
        }

        return specialMirrorList;
    }

    private List<Integer> reversList(Integer num) {

        List<Integer> newNum=new ArrayList<>();
        Integer newDigit;

        while (num>0) {

            newDigit = num % 10;
            newNum.add(newDigit);
            num = num / 10;
        }

        return newNum;

    }





    private Integer listToInt(List<Integer> newNum){

        Integer finalNum=0;
        int maxOrder=newNum.size();

        for (int order=maxOrder; order>0; order++
        ) {
            Integer shelf=newNum.get(order);
            finalNum+=shelf*(10*order);

        }
        return finalNum;
    }
}
