/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

public class BSTBoat {
    
    NodeBoat root;
    public BSTBoat() {root = null;}
    public BSTBoat(Boat bu){
        root.bu = bu;
    }
////////////////     
    void add(Boat bu){
        root = addrec(root,bu);
    }
    NodeBoat addrec(NodeBoat root, Boat bu) {

        if (root == null) { 
            return new NodeBoat(bu);
        } 
        if (bu.getBcode().compareTo(root.bu.getBcode())< 0 )
            root.left = addrec(root.left, bu);
        else if (bu.getBcode().compareTo(root.bu.getBcode())>0 )
            root.right = addrec(root.right, bu);
        return root; 
    }   
////////////////     
    boolean deleteNode(String x) { 
        if(searchRec(root,x)!=null){
            root = remove(root,x); 
            return true;
        }
            else return false;    
        
    }
    NodeBoat remove(NodeBoat root, String x){
        if(root == null){
            return root;    
        }
            
        if(x.compareTo(root.bu.getBcode())<0) root.right = remove(root.right,x);
        else if(x.compareTo(root.bu.getBcode())>0) root.left = remove(root.left,x);
        else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.bu = minValueNode(root.right);
            root.right = remove(root.right,root.bu.getBcode());
        }
        return root;
    }
    Boat minValueNode(NodeBoat root) {
        Boat min = root.bu;
        while (root.left != null) { 
            min = root.left.bu;
            root = root.left;
        } 
        return min; 
    } 
////////////////    
    boolean search(String x){
        NodeBoat p = searchRec(root,x);
        if(p!= null){
            p.bu.display();
            return true;
        }
        else return false;
    }
    NodeBoat searchRec(NodeBoat curr, String x){
        if(curr == null){
            return null;
        }
        else{
            
            if(x.compareTo(curr.bu.getBcode())<0)
                return(searchRec(curr.left,x));
            else if(x.compareTo(curr.bu.getBcode())>0)
                return(searchRec(curr.right,x));
            else
                return curr;
            
        }
    }    
////////////////
    void printInOrder(){
        inOrder(root);
    }
    void inOrder(NodeBoat root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println("");
            root.bu.display();
            inOrder(root.right);
        }
    }
//////////////// 
    int c = 0;
    int count(NodeBoat root){
        if(root != null) {
            count(root.left);
            c++;
            count(root.right);
        }
        return c;
    }
    
////////////////    
    void printBreathFirst(){
        inOrder(root);
    }
    void BreathFirst(NodeBoat root){
        if(root != null) {
            System.out.println("");
            root.bu.display();
            BreathFirst(root.left); 
            BreathFirst(root.right);
        }
    }
//////////////// Balance
    int height(NodeBoat root) {
        if (root == null)
            return 0;
        return root.height;
    }

    int getBalance(NodeBoat root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }
}
    
    

