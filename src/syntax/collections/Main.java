package syntax.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String DONE = "DONE";
    public static final String CANCELED = "CANCELED";
    public static final String PROCESSING = "PROCESSING";

    public static void main(String[] args) {

        List<InOutTransaction>  list = new ArrayList<>();
        List<InOutTransaction> resultList = new ArrayList<>();

        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78212", DONE)); //+
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-34212", DONE)); //+
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-79012", DONE)); //+

        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-79000", CANCELED)); //+

        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234", CANCELED));  //-
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234_1", CANCELED)); //-
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234_2", CANCELED)); //-
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234_3", CANCELED)); //-
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234_4", CANCELED)); //-
        list.add(new InOutTransaction("out_erjhtkej-23492yjk-28347j-78234_5", DONE)); //+

        for (InOutTransaction tr: list) {
            if(DONE.equals(tr.getType()) ||
                    (CANCELED.equals(tr.getType()) && !isAccelerated(tr.getGuid()))){
                resultList.add(tr);
            }
        }

        for (InOutTransaction guids: resultList) {
            System.out.println(guids.getGuid() + " " + guids.getType());
        }

    }

    public boolean isAccelerated2(String guid){
        String underscore = "_";
        if(guid.contains(underscore)){
            int underScoreIndex = guid.indexOf(underscore);
            return guid.substring(underScoreIndex + 1).contains(underscore);
        }
        return false;
    }

    public static boolean isAccelerated(String guid){
        int idx = guid.indexOf("_");
        if(idx >= 0){
            idx = guid.indexOf("_", idx + 1);
            return idx >= 0;
        }
        return false;
    }
}
