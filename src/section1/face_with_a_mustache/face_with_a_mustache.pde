PImage mustache;
PImage friend;

void setup(){
  friend = loadImage("face.jpg");
      size(800,600);
      friend.resize(width,height);
  mustache = loadImage("mustache.png");
     
  
}
void draw(){
  background(friend);
  if(mousePressed){
  image(mustache, mouseX,mouseY);
  }
  
 
  
  
}
