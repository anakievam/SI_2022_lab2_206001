Марија Анакиева, бр. на индекс 206001

public class SILab2 {

    public static List<String> function(List<String> list) {   //1
        if (list.size() <= 0) {   //2
            throw new IllegalArgumentException("List length should be greater than 0");   //3
        }   //4
        int n = list.size();   //5
        int rootOfN = (int) Math.sqrt(n);   //6
        if (rootOfN * rootOfN  != n) {   //7
            throw new IllegalArgumentException("List length should be a perfect square");   //8
        }   //9
        List<String> numMines = new ArrayList<>();   //10
        for (int i = 0; i < n; i++) {   //11
            if (!list.get(i).equals("#")) {   //12
                int num = 0;   //13
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {   //14
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){   //15
                        num += 2;   //16
                    }   //17
                    else {   //18
                        num  += 1;   //19
                    }   //20
                }   //21
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){   //22
                    num++;   //23
                }   //24
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){   //25
                    num++;   //26
                }   //27
                numMines.add(String.valueOf(num));   //28
            }   //29
            else {   //30
                numMines.add(list.get(i));   //31
            }   //32
        }   //33
        return numMines;   //34
    }   //35
}   //36


Control Flow Graph
![image](https://user-images.githubusercontent.com/101275524/171857977-3d397e8e-9ab3-4e6e-89ee-960876f28a26.png)

Цикломатска комплексност
Цикломатската комплексност на овој код е 9, истата се добива со броење на регионите во добиениот Control Flow Graph.

Тест случаи според Every Statement критериумот
![image](https://user-images.githubusercontent.com/101275524/171858206-41c5bd66-2e04-4f53-9d8a-3211e7e5d340.png)
 
Тест случаи според Every Branch критериумот
![image](https://user-images.githubusercontent.com/101275524/171858238-7aa72259-bdd7-4da3-a31f-48f5e852073b.png)

И по двата критериуми се доволни 3 теста за да бидат исполнети барањата и тоа еден тест поради кој ќе се фрли исклучок од првиот тип (влез празна листа), еден тест поради кој ќе се фрли исклучок од вториот тип (влез листа чија што должина не е перфектен квадрат) и еден тест со кој функцијата ќе заврши нормално и со поминување повеќе пати низ циклусот ќе ги помине сите јазли односно гранки.

