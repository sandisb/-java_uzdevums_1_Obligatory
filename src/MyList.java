public class MyList {

    //First node in the list
    static Node first;

       static class Node {
           int data;
           Node next;


           //Constructor
           Node(int a) {
               data = a;
               next = null;
           }
       }

       //Add node to the list
       public void add(int data){

           //Create a new node with entered data and set the next list item as null
           Node new_node = new Node(data);
           new_node.next = null;

           //If the list is empty, make the node as the first one in the list
           if(first == null){
               first = new_node;

           }

           //Else, add the node at the end of the list
           else{
               Node last = first;
               while(last.next != null){
                   last = last.next;
               }

               last.next = new_node;
           }
       }

    //Getting number based on it's position in the list
    public static int get (int number){

           Node searched = first;

            for(int i = 0; i < number; i++)
            {
                searched = searched.next;
            }

        //Return the value of the node
        return searched.data;
    }
}
