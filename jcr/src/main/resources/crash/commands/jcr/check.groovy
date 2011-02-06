import org.crsh.jcr.command.PathArg
import org.crsh.cmdline.annotations.Usage
import org.crsh.cmdline.annotations.Command;

public class check extends org.crsh.jcr.command.JCRCommand {
  // The path of the node to checkin
  @Usage("Checkin a node")
  @Command
  public void IN(@PathArg String path) throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    node.checkin();
  }

  // The path of the node to checkout
  @Usage("Checkout a node")
  @Command
  public void OUT(@PathArg String path) throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    node.checkout();
  }
}
