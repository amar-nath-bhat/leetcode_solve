class Q5
{
    public static void main(String args[])
    {

        MyHashMap obj = new MyHashMap();
        obj.put(1, 2);
        System.out.println(obj.get(1));
        obj.put(3, 5);
        obj.remove(1);
        
    }
}

class MyHashMap{
    int keys[], values[];

    public MyHashMap()
    {
        keys=new int[1000];
        values=new int[1000];
    }

    public void put(int key, int value)
    {
        int index=key%keys.length;
        if(keys[index]==key)
        {
            values[index]=value;
        }
        else
        {
            keys[index]=key;
            values[index]=value;
        }

    }

    public int get(int key)
    {
        int index=key%keys.length;
        if(keys[index]==key)
            return (values[index]);
        return -1;
    }

    public void remove(int key)
    {
        int index=key%keys.length;
        if(keys[index]==key)
        {
            keys[index]=-1;
            values[index]=-1;
        }
    }

}



// USING LINKED LISTS 
// class MyHashMap {
//     int key, value;

//     LinkedList<Integer> karr;
//     LinkedList<Integer> varr;

//     public MyHashMap() {
//         karr = new LinkedList<>();
//         varr = new LinkedList<>();
//     }
    
//     public void put(int key, int value) 
//     {
//         this.key=key;
//         this.value=value;
//         int i;
//         if(karr.contains(key))
//         {
//             i=karr.indexOf(key);
//             varr.add(i, value);;
//         }    
//         else
//         {
//             karr.add(key);
//             varr.add(value);
//         }
//     }
    
//     public int get(int key) 
//     {
//         int i;
//         if(karr.contains(key))
//         {
//             i=karr.indexOf(key);
//             return(varr.get(i));
//         }    
//         else
//             return -1;
//     }
    
//     public void remove(int key) {
//         int i;
//         if(karr.contains(key))
//         {
//             i=karr.indexOf(key);
//             varr.remove(i);
//             karr.remove(key);
//         }    
//         else
//             return;
            
//     }
// }

