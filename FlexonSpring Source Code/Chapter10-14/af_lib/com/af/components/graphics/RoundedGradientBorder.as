package com.af.components.graphics
{
	import flash.display.*;
	import flash.geom.*;
	import flash.utils.*;
	
	import mx.core.EdgeMetrics;
	import mx.skins.halo.HaloBorder;
	import mx.utils.ColorUtil;
	import mx.utils.GraphicsUtil;

	public class RoundedGradientBorder extends HaloBorder 
	{
		private var topCornerRadius:Number;		// top corner radius
		private var bottomCornerRadius:Number;	// bottom corner radius
		private var fillColors:Array;			// fill colors (two)
		private var setup:Boolean;
		
		private function setupStyles():void
		{
			fillColors = getStyle("fillColors") as Array;
			if (!fillColors) fillColors = [0xFFFFFF, 0xFFFFFF];
			
			topCornerRadius = getStyle("cornerRadius") as Number;
			if (!topCornerRadius) topCornerRadius = 0;	
			
			bottomCornerRadius = getStyle("bottomCornerRadius") as Number;
			if (!bottomCornerRadius) bottomCornerRadius = topCornerRadius;	
		}
		
		override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);	
			
			setupStyles();
			
			var _graphics:Graphics = this.graphics;
			var _border:EdgeMetrics = borderMetrics;
			var _width:Number = unscaledWidth - _border.left - _border.right;
		    var _height:Number = unscaledHeight - _border.top - _border.bottom;
		   
			// Create a Matrix gradient fill
			var matrix:Matrix = new Matrix();
			matrix.createGradientBox(_width,_height,1.57,0,0);
			_graphics.beginGradientFill("linear", fillColors, [1,1], [0, 255], matrix, SpreadMethod.PAD);
			var tr:Number = Math.max(topCornerRadius-2, 0);
			var br:Number = Math.max(bottomCornerRadius-2, 0);
			
			// Draw a complex rounded rectangle
			_graphics.drawRoundRectComplex(_border.left,_border.top, _width, _height, tr, tr, br, br);
			_graphics.endFill();
		}
	}
}