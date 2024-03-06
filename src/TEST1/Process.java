package TEST1;

import java.util.ArrayList;

interface Process {
        void process(int a, int b);
    }

     class Data {
        int value;

        Data(int value) {
            this.value = value;
        }

        public void processList(ArrayList<Data> dataList, Process p) {
            for (Data d : dataList) {
                p.process(d.value, d.value);
            }
        }

        public static void main(String[] args) {
            ArrayList<Data> al = new ArrayList<Data>();
            al.add(new Data(1));
            al.add(new Data(2));
            al.add(new Data(3));

            Data dataObj = new Data(0);
            dataObj.processList(al, (int a, int b) -> System.out.println(a * b));
        }
    }


    //1
//4
//9


