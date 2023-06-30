import {Component, Input} from '@angular/core';
import {PostService} from "../Services/post.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";
import {ReactionCommentService} from "../Services/reaction-comment.service";

@Component({
  selector: 'app-all-posts',
  templateUrl: './all-posts.component.html',
  styleUrls: ['./all-posts.component.css']
})
export class AllPostsComponent {
  constructor(private postService : PostService, private reactionCommentsService: ReactionCommentService, private router: Router,
              private route: ActivatedRoute,) {




  }
  @Input() posts:any;

  numberOfLikes: any;
  numberOfDislikes: any;
  numberOfHearts: any;

  reactionInt: any;

  react(event:any){

    let element = event.target || event.srcElement || event.currentTarget;
    let elementId = element.id;
    let likeQuantity = document.getElementById("like-quantity");
    if(element.innerText == "LIKE")
    {
      this.reactionInt = 0;
    }

    if(element.innerText == "DISLIKE")
    {
      this.reactionInt = 1;
    }

    if(element.innerText == "HEART")
    {
      this.reactionInt = 2;
    }

    this.reactionCommentsService.save(elementId, this.reactionInt);


  }

}
