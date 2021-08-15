import javax.swing.*;
 
public class MyButton extends JButton{
 
    private Icon imagemPadrao;
    private Icon imagemBotao;
 
    public MyButton(Icon imagemPadrao, Icon imagemBotao){
 
        super();
 
        this.imagemBotao = imagemBotao;
        this.imagemPadrao = imagemPadrao;
 
        setImagemPadrao();
    }
 
    public void setImagemPadrao(){
 
        this.setIcon(imagemPadrao);
    }
 
    public void setImagemBotao(){
 
        this.setIcon(imagemBotao);
    }    
 
    public Icon getImagemBotao(){
 
        return this.imagemBotao;
    }
}