import {Component, Input} from '@angular/core';
import {PostService} from "../Services/post.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-all-posts',
  templateUrl: './all-posts.component.html',
  styleUrls: ['./all-posts.component.css']
})
export class AllPostsComponent {
  constructor(private postService : PostService, private router: Router,
              private route: ActivatedRoute,) {




  }
  @Input() posts:any;

  react(event:any){

    // Get the source element
    let element = event.target || event.srcElement || event.currentTarget;
    // Get the id of the source element
    let elementId = element.id;
    let likeQuantity = document.getElementById("like-quantity");
    if(element.innerText == "Like")
    {

    }

    if(element.innerText == "Dislike")
    {

    }

    if(element.innerText == "Heart")
    {

    }


  }

}
