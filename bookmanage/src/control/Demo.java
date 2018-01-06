package control;


	import model.book;  
	import model.booklist;  
	  
	public class Demo {
	      
	    public boolean addBook(String bookname, String author, float price)  
	    {  
	        book book = new book(bookname,author,price);  
	        if (booklist.booklist.add(book))  
	        {  
	            return true;  
	        }  
	        else  
	            return false;  
	    }  
	      
	    public boolean deleteBook(int id)  
	    {  
	        if(booklist.booklist.remove(id) != null)  
	        {  
	            return true;  
	        }  
	        else  
	            return false;  
	    }  
	      
	    public boolean changeBoo(int id,String bookname, String author, float price)  
	    {  
	        book book = (book) booklist.booklist.get(id);  
	        if(book.setBook(bookname, author, price))  
	            return true;  
	        else  
	            return false;  
	    }  
	      
	    public void findBoo(int id)  
	    {  
	        book book = (book)booklist.booklist.get(id);  
	        System.out.println("查找成功，您查找到的书为第"+(id+1)+"本书！"+"书名为："+book.getBookname()+" 作者："+book.getAuthor()+" 单价："+book.getPrice()+"元/本");  
	    }  
	      
	    public int orderFind(int number)  
	    {  
	        //System.out.println(number);  
	        if(number <= booklist.booklist.size())  
	        {  
	            int id = number - 1;  
	            return id;  
	        }  
	        else  
	            return -1;  
	    }  
	      
	    public int nameFind(String name)  
	    {  
	        int id = -1;  
	        for(int i = 0; i < booklist.booklist.size(); i++)  
	        {  
	            book book = (book)booklist.booklist.get(i);  
	            if(book.getBookname().equals(name))  
	            {  
	                id = i;  
	                break;  
	            }  
	            else if(i<booklist.booklist.size())  
	                continue;  
	            else  
	            {  
	                System.out.println("未查找到您想要的书名");  
	                break;  
	            }  
	        }  
	        return id;  
	    }  
	      
	    public void printAllBook()  
	    {  
	        for (int i = 0; i < booklist.booklist.size(); i++)  
	        {  
	            book book = (book)booklist.booklist.get(i);  
	            System.out.println("第"+(i+1)+"本书名："+book.getBookname()+" 作者："+book.getAuthor()+" 单价："+book.getPrice()+"元/本");  
	        }  
	    }  
	}  
