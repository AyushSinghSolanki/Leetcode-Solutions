
class FreqStack {

    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {

        // Value ki frequency increase karo
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);

        // Maximum frequency update karo
        maxFreq = Math.max(maxFreq, f);

        // Is frequency ke stack mein value push karo
        group.putIfAbsent(f, new Stack<>());
        group.get(f).push(val);
    }

    public int pop() {

        // Maximum frequency wale stack se top element nikalo
        int val = group.get(maxFreq).pop();

        // Value ki frequency decrease karo
        freq.put(val, freq.get(val) - 1);

        // Agar maximum frequency wala stack empty hai
        // toh maximum frequency ko decrease kar do
        if (group.get(maxFreq).isEmpty()) {
            maxFreq--;
        }

        return val;
    }
}

