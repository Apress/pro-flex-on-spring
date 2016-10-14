package com.af.cep.controller
{
    import org.puremvc.as3.interfaces.*;
    import org.puremvc.as3.patterns.command.*;
    import org.puremvc.as3.patterns.observer.*;
    
    import com.af.cep.*;
    import com.af.cep.model.*;
    
    public class ModelInitCommand extends SimpleCommand
    {
            override public function execute( note:INotification ) :void    
            {
                  facade.registerProxy(new ContactProxy());
            }
      }
}
