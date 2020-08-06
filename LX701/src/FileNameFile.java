import java.io.File;
import java.io.FilenameFilter;

public class FileNameFile implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".rar") || name.endsWith(".docx")){
            return false;
        }
        return true;
    }
}
