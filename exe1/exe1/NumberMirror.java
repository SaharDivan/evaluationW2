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
        System.out.println(newNum);
        return newNum;

    }


    private Integer listToInt(List<Integer> newNum){

        Integer finalNum=0;
        int maxOrder=newNum.size()-1;

        for (Integer order=0; order<=maxOrder; order++
        ) {
            Integer shelf=newNum.get(order);
            finalNum+=shelf*(tenPower(maxOrder-order));
        }
        return finalNum;
    }


    private Integer tenPower(Integer order) {

        int times=0;
        Integer num=1;

        while ((times<order)){
           num=10*num;
           times++;
        }
        return num;
    }
}
