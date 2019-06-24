void setup(){
  size(800,600);
  background(0,255,0);
  
  
}
void draw(){
  if(mousePressed){
  fill(random(256), random(256), random(256));
  }
  else{
    fill(0,255,0);
  }
  
  rect(100,50,width,height);
  
  
}
