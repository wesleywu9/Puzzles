import java.util.PriorityQueue;
import java.util.Comparator;

class huffman_codes {
    private PriorityQueue<huff_node> min_heap = new PriorityQueue<huff_node>(freq_comparator);
    private char[] chars;
    private int[] freqs;
    private huff_node root;

    huffman_codes(char[] chars, int[] freqs) {
        this.chars = chars;
        this.freqs = freqs;
        build_heap();
    }

    void build_heap() {
        for(int i=0; i<chars.length; i++) {
            huff_node curr = new huff_node(chars[i], freqs[i]);
            min_heap.add(curr);
        }
    }

    huff_node build_tree() {
        root.left = ;
        root.right = min_heap.poll();

    }
    
    public static void main(String args[]) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freqs = {5, 9, 12, 13, 16, 45};
        
    }
}

class huff_node {
    public char c;
    public int f;
    public huff_node left;
    public huff_node right;
    huff_node(char c, int f) {
        this.c = c; 
        this.f = f;
    }
}

class freq_comparator implements Comparator<huff_node> {
    public int compare(huff_node a, huff_node b) {
        return a.f-b.f;
    }
}

