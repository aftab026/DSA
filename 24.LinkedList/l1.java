// package 24.LinkedList;

public class l1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;



    // methods
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head; //link

        // step 3 - head  = newNodde
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {  //O(n)
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }



    public int removeFirst(){
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }



    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for(int i= 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public int itrSearch(int key) { //O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }



    public int helper(Node head, int key){
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }




    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }




    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // removeFirst
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }




    // check if ll is a palindrome
    // slow - fast approach
    public Node findMid(Node head){ //helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // rigth half head
        Node left = head;

        // step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }




    // detect a loop/cycle in a LL
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }

        return false; //cycle doesn't exist
    }










    // remove a loop/cycle in a LL
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
            if(cycle == false){
                return;
            }
        }

        // find meeting point
        slow = head;
        Node prev = null;  //last node
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        // l1  l1 = new l1();
        // l1.print();
        // // l1.head = new Node(1);
        // // l1.head.next = new Node(2);
        // l1.addFirst(2);
        // l1.print();
        // l1.addFirst(1);
        // l1.print();
        // l1.addLast(3);
        // l1.print();
        // l1.addLast(4);
        // l1.add(2, 9);

        // l1.print();
        // System.out.println("Total size is : " + l1.size);


        // // l1.removeFirst();
        // // l1.print();
        // // System.out.println("Total size is : " + l1.size);


        // // l1.removeLast();
        // // l1.print();
        // // System.out.println("Total size is : " + l1.size);


        // // System.out.println(l1.itrSearch(3));
        // // System.out.println(l1.itrSearch(11));


        // // l1.reverse();
        // // l1.print();



        // // l1.deleteNthfromEnd(3);
        // // l1.print();


        // System.out.println(l1.checkPalindrome());







        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1 ->2->3->2
        System.out.println(isCycle());
        removeCycle();
        
        System.out.println(isCycle());


    }
}
