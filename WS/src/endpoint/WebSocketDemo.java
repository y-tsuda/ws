package endpoint;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 * WebSocketデモ。
 *
 * @author DukeLab
 */
// Webソケットのサーバ側クラスであること表すアノテーション。
// 引数(wsdemo)はクライアントから接続時、使われるURIを表す。
@ServerEndpoint(value = "/wsdemo")
public class WebSocketDemo {

    @OnMessage
    public String onMessage(String text) {
        return text;
    }
    
}