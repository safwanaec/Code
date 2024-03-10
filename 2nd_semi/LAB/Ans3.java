import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Ans3 {
    public static void main(String[] args) {
        LogFileReader reader = new LogFileReader();
        List<String> logEntries = reader.readLogFile("D://Log.txt");

        if (logEntries.isEmpty()) {
            System.out.println("Error: Log file is empty!");
            return;
        }

        new LogAnalyzer().AnalyzeLogs(logEntries);
    }
}

class LogFileReader{
    List<String> readLogFile(String filePath){
        List<String> content = new ArrayList<>();

        try {
            String line;
            BufferedReader read = new BufferedReader(new FileReader(filePath));

            while((line=read.readLine())!=null){
                content.add(line);
            }
            read.close();

        } catch (Exception e) {

            e.printStackTrace();
        }


        return content;
    }
}
/*
 * 2024-02-29 10:20:31 [INFO] User "admin" logged in successfully from IP address 192.168.1.10.
 * 
 * 2024-02-29 12:15:45 [INFO] File "index.html" was modified by user "john" on server "webserver1".
 * 
 * 2024-02-29 15:30:00 [DEBUG] SQL query "SELECT * FROM users" executed successfully on database "customers".
 * 
 * 2024-02-29 17:45:12 [ERROR] Internal server error (500) occurred while processing request for "/api/products". Details: java.lang.NullPointerException: product not found.
 */

class LogAnalyzer{
    void AnalyzeLogs(List<String> logEntries){
        String dateStamps ="\\d{4}-\\d{2}-\\d{2}";
        String timeStamps ="\\d{2}:\\d{2}:\\d{2}";
        String tag = "\\[(.*?)\\]";
        String errorCode = "\\(d{3}\\)";

        List<Integer> errorCodes = new ArrayList<>();

        int[] Count={0,0,0,0};

        Pattern[] pattern = new Pattern[4];
        pattern[0] = Pattern.compile(dateStamps);
        pattern[1] = Pattern.compile(timeStamps);
        pattern[2] = Pattern.compile(tag);
        pattern[3] = Pattern.compile(errorCode);

        try{
            for(String entry : logEntries){
                for(int i= 0; i<4; i++){
                    if(pattern[i].matcher(entry).matches()){
                        Count[i]++;
                       if(i==4){
                        errorCodes.add(Integer.parseInt(pattern[3].matcher(entry).group(1)));
                        }
                    }
                }
                if(entry==null){
                    throw new LogAnalysisException("Entry can not be null!");
                }
            }
        }
        catch(LogAnalysisException e){

        }

        System.out.println("There are " + Count[0] + " Date Stamps");
        System.out.println("There are " + Count[1] + " Time Stamps");
        System.out.println("There are " + Count[2] + " Tags");
        System.out.println("There are " + Count[3] + " Error Codes\n\nError Codes:\n");

        for(int i=0; i<Count[3]; i++){
            System.out.println(errorCodes.get(i));
        }
    }
}

class LogAnalysisException extends Exception{
    LogAnalysisException(String str){
        super(str);
    }
}








/*
 * You are tasked with developing a og analysis tool for a server
 * application. The Log files contain information about various
 * server events. Your goal is to extract and analyze specific 
 * information from these logs. Implement a java programe that
 * handles exceptions related to log file processing.
 * 
 * Log File Reader:
 * Create a LogFileReader class that reads data from a log file.
 * the class should have a method 
 TODO readLogFile(String filePath);
 * That takes the file path as a parameter and returns a list
 * of log entries. Handle
 ! FileNotFoundException
 ! IOException
 * appropriately.
 * 
 * Log Analyzer:
 * Implement a log analyzer class that processes the log data.
 * assume that each log entry contains information about server 
 * events, including timestamps and error messages. Implement a
 * method 
 TODO AnalyzeLogs(List<String> logEntries) 
 * that extracts and analyzes specific information from the logentries
 * 
 * 
 * Main Application:
 * 
** Write a main application class thet uses the LogFileReader and LogAnalyzer
** Classes to read log data from file and perform analysis
 *
** Handle Exceptions at appropriate levels (e.g. if the file is not found
** or During the Log analysis)
 * 
** Create a custom exception class. LogAnalysisException that extends 
** Exception Throw this Exception in case of any unexpected issues
** during log analysis
 * 
 * Your sollution should demonstrate a good understanding of Java 
 * Exceptionhandling and resolving issues related to log file processing.
 * 
 * 
 */