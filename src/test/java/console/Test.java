package console;

import java.io.File;
import java.io.IOException;

import console.common.ConsoleUtils;

/**
 * @author soullistener
 * Created on 2019/12/18.
 * @description
 */
class Test {

    //测试本地生成java.class 、bin、abi
    public static void main(String[] args) {
        String solName = "HelloWorld.sol";

        File solFileList = new File(ConsoleUtils.SOLIDITY_PATH);
        String tempDirPath = new File(ConsoleUtils.JAVA_PATH).getAbsolutePath();
        try {
            ConsoleUtils.compileSolToJava(solName, tempDirPath, ConsoleUtils.CLASS_PATH, solFileList, ConsoleUtils.ABI_PATH, ConsoleUtils.BIN_PATH);
            System.out.println(
                    "\nCompile solidity contract files to java contract files successfully!");
        } catch (IOException e) {
            System.out.print("error:"+e.getMessage());
        }
    }
}
