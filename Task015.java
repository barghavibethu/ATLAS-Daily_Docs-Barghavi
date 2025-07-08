public class Task015<Key, Value> {
    private static class HashTableNode {

        Object key;
        Object value;
        boolean active;
        boolean tombstoned; // Allow reuse of removed slots

        public HashTableNode() {
// All nodes in array will begin initialized this way
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Object initKey, Object initData) {
            key = initKey;
            value = initData;
            active = true;
            tombstoned = false;
        }
    }

    private final static int TABLE_SIZE = 9;
    private Object[] table;

    public Task015() {
// Since HashNodeTable has generics, we can not have
// a new HashNodeTable[], so use Object[]
        table = new Object[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++){
            table[i] = new HashTableNode();
    }
}
    public Value put(Key key, Value value) {
        int index = Math.abs(key.hashCode()) % TABLE_SIZE;
        int originalIndex = index;
        int i = 0;

        while (true) {
            HashTableNode node = (HashTableNode) table[index];

            if (!node.active || node.tombstoned || (node.key != null && node.key.equals(key))) {
                Value oldValue = (Value) node.value;
                node.key = key;
                node.value = value;
                node.active = true;
                node.tombstoned = false;
                return oldValue;
            }

            i++;
            if (i == TABLE_SIZE) {
                throw new RuntimeException("Hash table is full");
            }
            index = (originalIndex + i) % TABLE_SIZE;
        }
    }

    public void printTable() {
        System.out.println("Hash Table Contents: ");
        for (int i = 0; i < TABLE_SIZE; i++) {
            HashTableNode node = (HashTableNode) table[i];
            if (node.key != null && node.active && !node.tombstoned) {
                System.out.println(i + " => " + node.key + ": " + node.value);
            } else {
                System.out.println(i + "=> [empty]");
            }
        }
    }

    public static void main(String[] args) {
        Task015<String, Integer> ht = new Task015<>();

        ht.put("apple", 10);
        ht.put("banana", 20);
        ht.put("orange", 30);
        ht.put("grape", 40);
        ht.put("kiwi", 50);
        ht.put("lemon", 60);
        ht.put("mango", 70);
        ht.put("berry", 80);
        ht.put("melon", 90);
        System.out.println("\nAfter inserting elements: ");
        ht.printTable();
    }
}


