import ExtraNode.Node;

public class Offer36 {

    boolean flag = true;
    Node head;

    public Node treeToDoublyList(Node root) {

        if(root==null){
            return null;
        }
        track(root);
        return head;
    }

    public Node track(Node p){


        if(p.left==null&&p.right==null){
            if(flag){
                flag=false;
                head = p;
            }
            return p;
        }
        
        if(p.left!=null){
            p.left = track(p.left);
        }
        if(p.right!=null){
            p.right = track(p.right);
        }
        
        return p;
    }
}