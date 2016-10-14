package com.af.cep.controller
{
      import org.puremvc.as3.patterns.command.*;
      import org.puremvc.as3.interfaces.*;

      public class ApplicationStartupCommand extends MacroCommand
      {
            override protected function initializeMacroCommand() :void
            {
                  addSubCommand( ModelInitCommand );
                  addSubCommand( ViewInitCommand );
             }
      }
}
