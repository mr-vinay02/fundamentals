package collection.list.queue;

import collection.list.stack.queue.Queue;

public class GenerateBinaryNumber {

    static String[] generatBinaryNumber(int numbers){

        String[] binary = new String[numbers];
        Queue<String> queue = new Queue<>();

        queue.push("1");

        for (int i = 0; i < numbers; i++) {
            String value = queue.remove();
            binary[i] = value;
            queue.push(value + "0");
            queue.push(value + "1");
        }

        return binary;
    }

    public static void main(String[] args) {
        for(String binary : generatBinaryNumber(10))
            System.out.println(binary);
    }
}
