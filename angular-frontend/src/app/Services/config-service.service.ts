import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConfigServiceService {
  login_url: string;
  _api_url: string;
  _user_url: string;
   _users_url: string;
   _signup_url: string;
  _passchange_url: string;

  constructor() {
    this._api_url = 'http://localhost:8080/api';
    this._user_url = this._api_url + '/users';
    this.login_url =this._user_url + '/login';
    this._signup_url = this._user_url + '/register';
    this._passchange_url = this._user_url + "/changepass";


    this._users_url = this._user_url + '/all';



    this._signup_url = this._user_url + '/signup';


  }
}
