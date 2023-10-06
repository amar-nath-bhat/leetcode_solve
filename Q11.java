//Add two numbers

class Q11 {
    public static void main(String args[])
    {
        Solution11 sol = new Solution11();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        System.out.println(sol.addTwoNumbers(l1, l2));
    }    
}

class ListNode 
 {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution11 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode prev = node;
        int c =0;

        while(l1 != null || l2!= null || c!=0)
        {
            int d1 = (l1!=null)?l1.val:0;
            int d2 = (l2!=null)?l2.val:0;
            int sum = d1 + d2 + c;
            c=sum/10;
            ListNode newnode = new ListNode(sum%10);
            prev.next=newnode;
            prev=prev.next;

            l1 = (l1!=null)?l1.next:null;
            l2 = (l2!=null)?l2.next:null;
        }

        ListNode temp = node.next;
        node.next=null;
        return temp;
    }
}