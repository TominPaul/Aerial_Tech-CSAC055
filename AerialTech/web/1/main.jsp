<%-- 
    Document   : main
    Created on : Oct 2, 2019, 12:27:57 PM
    Author     : mrvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
 table.dataTable thead .sorting:after,
table.dataTable thead .sorting:before,
table.dataTable thead .sorting_asc:after,
table.dataTable thead .sorting_asc:before,
table.dataTable thead .sorting_asc_disabled:after,
table.dataTable thead .sorting_asc_disabled:before,
table.dataTable thead .sorting_desc:after,
table.dataTable thead .sorting_desc:before,
table.dataTable thead .sorting_desc_disabled:after,
table.dataTable thead .sorting_desc_disabled:before {
bottom: .5em;
}
    </style>
    <html lang="en">
    <head>
        <title>Moving Boxes Menu with jQuery</title>
		<meta charset=utf-8>
        <meta name="description" content="Moving Boxes Menu with jQuery" />
        <meta name="keywords" content="jquery, boxes, menu, rotating, content, background image, full page"/>
		<link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
        <link rel="stylesheet" type="text/css" href="css/style_1.css" />
		<link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css' />
		<link href='http://fonts.googleapis.com/css?family=Astloch:regular,bold' rel='stylesheet' type='text/css' />
		<link type="text/css" href="css/jquery.jscrollpane.css" rel="stylesheet" media="all" />
		<link rel= "stylesheet" href="css/table.css"/>
		
    </head>
    <body>
		<div id="mb_background" class="mb_background">
			<img class="mb_bgimage" src="images/default.jpg" alt="Background"/>
			<div class="mb_overlay"></div>
			<div class="mb_loading"></div>
		</div>
		<div id="mb_pattern" class="mb_pattern"></div>
		<div class="mb_heading">
			<h1>Aerial Tech</h1>
		</div>
		<div id="mb_menu" class="mb_menu">
			<a href="#" data-speed="1000" data-easing="easeOutBack">About</a>
			<a href="#" data-speed="1000" data-easing="easeInExpo">Work</a>
			<a href="#" data-speed="1000" data-easing="easeOutBack">Media</a>
			<a href="#" data-speed="1000" data-easing="easeInExpo">Contact</a>
		</div>
		<div id="mb_content_wrapper" class="mb_content_wrapper">
			
			<div class="mb_content">
				<h2>Category Details</h2>
				<div class="mb_content_inner">
					<div class="table-wrapper-scroll-y my-custom-scrollbar">

  <table class="table table-bordered table-striped mb-0" border= 1 table color="white">
    <thead>
      <tr>
        <th scope="col">Category Name</th>
        <th scope="col">Number of Products</th>
       
      </tr>
    </thead>
    <tbody>
      <tr>
      
        <td>Mark</td>
        <td>Otto</td>
       
      </tr>
      <tr>
   
        <td>Jacob</td>
        <td>Thornton</td>
      
      </tr>

    </tbody>
  </table>

</div>


					</div>
                                

			</div>

			<div class="mb_content">
				<h2>Work</h2>
				<div class="mb_content_inner">
					<p>She packed her seven versalia, put her initial into the belt and made herself on the way.</p>
					<ul id="mb_imagelist" class="mb_imagelist">
						<li><img src="images/small/1.jpg" alt="image1" data-bgimg="images/image1.jpg"/></li>
						<li><img src="images/small/2.jpg" alt="image2" data-bgimg="images/image2.jpg"/></li>
						<li><img src="images/small/3.jpg" alt="image3" data-bgimg="images/image3.jpg"/></li>
						<li><img src="images/small/4.jpg" alt="image4" data-bgimg="images/image4.jpg"/></li>
						<li><img src="images/small/2.jpg" alt="image2" data-bgimg="images/image2.jpg"/></li>
						<li><img src="images/small/1.jpg" alt="image1" data-bgimg="images/image1.jpg"/></li>
						<li><img src="images/small/4.jpg" alt="image4" data-bgimg="images/image4.jpg"/></li>
						<li><img src="images/small/3.jpg" alt="image3" data-bgimg="images/image3.jpg"/></li>
					</ul>
					<p>When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane.</p>
					<p>Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy.</p>
					<p>The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word "and" and the Little Blind Text should turn around and return to its own, safe country.</p>
					<p>But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their projects again and again.</p>
				</div>
			</div>
			<div class="mb_content">
				<h2>Media</h2>
				<div class="mb_content_inner">
					<p>One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin.</p>
					<p>He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections.</p>
					<p>The bedding was hardly able to cover it and seemed ready to slide off any moment.</p>
					<p>His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. "What's happened to me? " he thought. It wasn't a dream. His room, a proper human</p>
				</div>
			</div>
			<div class="mb_content">
				<h2>Contact</h2>
				<div class="mb_content_inner">
					<form>
						<div><label>Name:</label><input type="text" /></div>
						<div><label>Email:</label><input type="text" /></div>
						<div><label>Message:</label><textarea></textarea></div>
						<div><button>Send</button></div>
					</form>
				</div>
			</div>
		</div>
		<div class="mb_footer">
			<a class="mb_left" href="http://tympanus.net/Tutorials/ExpandingImageMenu/"><span>&laquo; Previous Demo:</span> Expanding Image Menu with jQuery</a>
			<a href="http://tympanus.net/codrops/2011/03/28/moving-boxes-content/"><strong>back to the Codrops tutorial</strong></a>
			<a href="http://www.flickr.com/people/jinthai/" target="_blank">Photography by jin.thai</a>
		</div>
		<!-- The JavaScript -->
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
		<!-- the mousewheel plugin - optional to provide mousewheel support -->
		<script type="text/javascript" src="js/jquery.mousewheel.js"></script>
		<!-- the jScrollPane script -->
		<script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
		<script type="text/javascript" src="js/jquery.transform-0.9.3.min_.js"></script>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.11/jquery-ui.min.js"></script>
		<script type="text/javascript">
			$(function() {
				var $menu			= $('#mb_menu'),
				$menuItems			= $menu.children('a'),
				$mbWrapper			= $('#mb_content_wrapper'),
				$mbClose			= $mbWrapper.children('.mb_close'),
				$mbContentItems		= $mbWrapper.children('.mb_content'),
				$mbContentInnerItems= $mbContentItems.children('.mb_content_inner');
				$mbPattern			= $('#mb_pattern'),
				$works				= $('#mb_imagelist > li'),
				$mb_bgimage			= $('#mb_background > img'),
				
				Menu		 		= (function(){
					
					var init		= function() {
						preloadImages();
						initPlugins();
						initPattern();
						initEventsHandler();
					},
					//preloads the images for the work area (data-bgimg attr)
					preloadImages	= function() {
						$works.each(function(i) {
							$('<img/>').attr('src' , $(this).children('img').data('bgimg'));
						});
					},
					//initialise the jScollPane (scroll plugin)
					initPlugins		= function() {
						$mbContentInnerItems.jScrollPane({
							verticalDragMinHeight: 40,
							verticalDragMaxHeight: 40
						});
					},
					/*
						draws 16 boxes on a specific area of the page.
						we randomly calculate the top, left, and rotation angle for each one of them
					 */
					initPattern		= function() {
						for(var i = 0; i < 16 ; ++i) {
							//random opacity, top, left and angle
							var o		= 0.1,
							t		= Math.floor(Math.random()*196) + 5, // between 5 and 200
							l		= Math.floor(Math.random()*696) + 5, // between 5 and 700
							a		= Math.floor(Math.random()*101) - 50; // between -50 and 50
									
							$el		= $('<div>').css({
								opacity			: o,
								top				: t + 'px',
								left			: l + 'px'
							});
								
							if (!$.browser.msie)
								$el.transform({'rotate'	: a + 'deg'});
								
							$el.appendTo($mbPattern);
						}
						$mbPattern.children().draggable(); //just for fun
					},
					/*
						when the User closes a content item, we move the boxes back to the original place,
						with new random values for top, left and angle though
					 */
					disperse 		= function() {
						$mbPattern.children().each(function(i) {
							//random opacity, top, left and angle
							var o			= 0.1,
							t			= Math.floor(Math.random()*196) + 5, // between 5 and 200
							l			= Math.floor(Math.random()*696) + 5, // between 5 and 700
							a			= Math.floor(Math.random()*101) - 50; // between -50 and 50
							$el			= $(this),
							param		= {
								width	: '50px',
								height	: '50px',
								opacity	: o,
								top		: t + 'px',
								left	: l + 'px'
							};
									
							if (!$.browser.msie)
								param.rotate	= a + 'deg';
									
							$el.animate(param, 1000, 'easeOutExpo');
						});
					},
					initEventsHandler	= function() {
						/*
							click a link in the menu
						 */
						$menuItems.bind('click', function(e) {
							var $this	= $(this),
							pos		= $this.index(),
							speed	= $this.data('speed'),
							easing	= $this.data('easing');
							//if an item is not yet shown
							if(!$menu.data('open')){
								//if current animating return
								if($menu.data('moving')) return false;
								$menu.data('moving', true);
								$.when(openItem(pos, speed, easing)).done(function(){
									$menu.data({
										open	: true,
										moving	: false
									});
									showContentItem(pos);
									$mbPattern.children().fadeOut(500);
								});
							}
							else
								showContentItem(pos);
							return false;
						});
							
						/*
							click close makes the boxes animate to the top of the page
						 */
						$mbClose.bind('click', function(e) {
							$menu.data('open', false);
							/*
								if we would want to show the default image when we close:
								changeBGImage('images/default.jpg');
							 */
							$mbPattern.children().fadeIn(500, function() {
								$mbContentItems.hide();
								$mbWrapper.hide();
							});
								
							disperse();
							return false;
						});
							
						/*
							click an image from "Works" content item,
							displays the image on the background
						 */
						$works.bind('click', function(e) {
							var source	= $(this).children('img').data('bgimg');
							changeBGImage(source);
							return false;
						});
								
					},
					/*
						changes the background image
					 */
					changeBGImage		= function(img) {
						//if its the current one return
						if($mb_bgimage.attr('src') === img || $mb_bgimage.siblings('img').length > 0)
							return false;
									
						var $itemImage = $('<img src="'+img+'" alt="Background" class="mb_bgimage" style="display:none;"/>');
						$itemImage.insertBefore($mb_bgimage);
							
						$mb_bgimage.fadeOut(1000, function() {
							$(this).remove();
							$mb_bgimage = $itemImage;
						});
						$itemImage.fadeIn(1000);
					},
					/*
						This shows a content item when there is already one shown:
					 */
					showContentItem		= function(pos) {
						$mbContentItems.hide();
						$mbWrapper.show();
						$mbContentItems.eq(pos).show().children('.mb_content_inner').jScrollPane();
					},
					/*
						moves the boxes from the top to the center of the page,
						and shows the respective content item
					 */
					openItem			= function(pos, speed, easing) {
						return $.Deferred(
						function(dfd) {
							$mbPattern.children().each(function(i) {
								var $el			= $(this),
								param		= {
									width	: '100px',
									height	: '100px',
									top		: 154 + 100 * Math.floor(i/4),
									left	: 200 + 100 * (i%4),
									opacity	: 1
								};
										
								if (!$.browser.msie)
									param.rotate	= '0deg';
										
								$el.animate(param, speed, easing, dfd.resolve);
							});
						}
					).promise();
					};
						
					return {
						init : init
					};
					
				})();
			
				/*
					call the init method of Menu
				 */
				Menu.init();
			});
		</script>
    </body>
</html>