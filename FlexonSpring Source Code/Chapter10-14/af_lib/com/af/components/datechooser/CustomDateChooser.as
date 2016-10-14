package com.af.components.datechooser
{
	import flash.display.Graphics;
	
	import mx.containers.VBox;
	import mx.controls.DateChooser;
	import mx.core.mx_internal;
	
	use namespace mx_internal;
	
	public class CustomDateChooser extends DateChooser
	{
		[Bindable] public var displayDate:String;
		private var _yearDisplayVisible:Boolean = true;
		private var _fwdMonthButtonVisible:Boolean = true;
		private var _backMonthButtonVisible:Boolean = true;
		public var highlightDaysArray:Array = new Array();
		private var gradientContainer:VBox = new VBox();
		
		public function CustomDateChooser():void
		{
			gradientContainer.setStyle("styleName", "CustomDateChooser");
			this.addChild(gradientContainer);	
		}
	    override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
	    {
	     	var borderColor:Number = getStyle("borderColor");
	     	var borderThickness:Number = getStyle("borderThickness");
	     	var headerHeight:Number = getStyle("headerHeight");
	     	
		    super.updateDisplayList(unscaledWidth, unscaledHeight);
		 
		    //Remove the header 
		    var calHG:Graphics = calHeader.graphics;
		   	calHG.clear();
		    
		    //Remove the body
		    var calBody:Graphics = background.graphics;
		    calBody.clear();
		
		    //Remove the border
		    var calBorder:Graphics = border.graphics;
		    calBorder.clear();
		    
        	// hide a few things
			fwdMonthButton.visible = _fwdMonthButtonVisible;
			backMonthButton.visible = _backMonthButtonVisible;
			monthDisplay.visible = false;

			// Format and move the Year
			yearDisplay.text = String(monthDisplay.text) + " " + String(yearDisplay.text).substr(2,2);
			yearDisplay.width = this.width;
			yearDisplay.move(0, monthDisplay.y);

			displayDate = yearDisplay.text;
			
			yearDisplay.visible = _yearDisplayVisible;
			
			gradientContainer.height = this.height;
			gradientContainer.width = this.width;
	    }
	    public function set fwdMonthButtonVisible(value:Boolean):void
	    {
	        if (value == _fwdMonthButtonVisible)
	            return;
	
	        _fwdMonthButtonVisible = value;
	    }
	    public function set backMonthButtonVisible(value:Boolean):void
	    {
	        if (value == _backMonthButtonVisible)
	            return;
	
	        _backMonthButtonVisible = value;
	    }
	   	public function set yearDisplayVisible(value:Boolean):void
	    {
	        if (value == _yearDisplayVisible)
	            return;
	
	        _yearDisplayVisible = value;
	    }
	}
}