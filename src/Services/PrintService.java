package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();


    public void addValue(Integer value){
        list.add(value);
    }

    public Integer first (){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.println("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));

        }
        for(int i = 0; i < list.size(); i++ ){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
    
}