package String.NonVowels;
public class PrintNonVowels {
    void Print(String string){
        char[]array=string.toCharArray();
        int count=0,max=0;
        int length=string.length();
        for(int iterator=0;iterator<length;iterator++){
            if(array[iterator]=='a'||array[iterator]=='e'||array[iterator]=='i'||array[iterator]=='o'||array[iterator]=='u'){
                array[iterator]='*';
                if(count>max){
                    max=count;
                }
                count=0;
            }
            else{
                count++;
                if(iterator==length-1){
                    if(count>max) max=count;                }
            }
        }
        count=0;
        int n=0;
        for(int iterator=0;iterator<length&&max!=0;iterator++){
            if(array[iterator]!='*') count++;
            else if(array[iterator]=='*'){
                if(count==max){
                    if(n!=0) System.out.print(",");
                    for(int iterator1=iterator-count;iterator1<iterator;iterator1++){
                        System.out.print(array[iterator1]);
                    }
                    n++;
                }
                count=0;
            }
        }    
    }    
}
