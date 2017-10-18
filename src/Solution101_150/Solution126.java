package Solution101_150;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution126 {
	
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    	List<List<String>> result = new ArrayList<List<String>> ();
    	
    	path(beginWord, endWord, wordList,result);
    	
    	return result;

    }
    
    
    public void path(String beginWord, String endWord, List<String> wordList, List<List<String>> result,List<String> path){	
    	
    	if(beginWord.equals(endWord)) {
    		List<String> temp = new ArrayList<String>();
    		temp = path;
    		result.add(temp);
    		return;
    	}
    	
    	  Queue<String > queue = new LinkedList<String>();
    	
    	while(!wordList.isEmpty() && !queue.isEmpty()){
    		for(int i = 0; i<wordList.size();i++){
    			if(hammingdistance(queue.poll(), wordList.get(i))==1){
    				queue.add(wordList.get(i));
    			}
    		}
    	}
    	
    	
		
	}
    
  public void path(String beginWord,String endWord, List<String> wordList, List<List<String>> result){	
	  
	  Queue<String > curlevel = new LinkedList<String>();
	  Queue<String > nextlevel = new LinkedList<String>();
	  
	  ArrayList<String> path = new ArrayList<String>();
	  
	  curlevel.add(beginWord);
	  //path.add(beginWord);
	  String cur;
	  while(!curlevel.isEmpty() || !nextlevel.isEmpty() ){
		  if(!curlevel.isEmpty()){
			  wordList.remove(curlevel);
			  while(!curlevel.isEmpty()){
					  cur = curlevel.poll();
					  if(hammingdistance(cur, endWord) == 0){
						  ArrayList<String> finded = new ArrayList<String>(path);
						  finded.add(cur);
						  result.add(finded);
						  path.remove(path.size()-1);
					  } else{
						  path.add(cur);
						  for(int i=0;i<wordList.size(); i++){
							  if(hammingdistance(cur, wordList.get(i))==1){
								  nextlevel.add(wordList.get(i));
							  }
						  }							  
					  }
				
		  		}
		  } 
		  
		  if(!nextlevel.isEmpty()){
			  wordList.remove(nextlevel);
			  while(!nextlevel.isEmpty()){
					  cur = nextlevel.poll();
					  if(hammingdistance(cur, endWord) == 0){
						  ArrayList<String> finded = new ArrayList<String>(path);
						  finded.add(cur);
						  result.add(finded);
						  path.remove(path.size()-1);
					  }else{
						  path.add(cur);
						  for(int i=0;i<wordList.size(); i++){
							  if(hammingdistance(cur, wordList.get(i))==1){
								  curlevel.add(wordList.get(i));
							  }
						  }	
					  }
		  		}
		  }
		  
	  }

	  
	}
    
    
    
    
    public int hammingdistance(String a, String b){
    	int count = 0;
    	for(int i = 0; i<a.length();i++){
    		if(a.charAt(i) != b.charAt(i)) count++;
    	}
    	return count;
    }

}
