import { Injectable } from '@angular/core';
import { Registration } from './registration';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Login} from './login';
import {JwtAutResponse} from './jwt-aut-response';
import {map} from 'rxjs/operators';
import {LocalStorageService} from 'ngx-webstorage';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private backend_url = 'http://localhost:8080/';

  constructor(private httpClient: HttpClient, private localStorageService: LocalStorageService) {
  }

  register(registration: Registration): Observable<any> {
    return this.httpClient.post(this.backend_url + 'users', registration);
  }

  login(login: Login): Observable<boolean> {
    console.log(login);
    return this.httpClient.post<JwtAutResponse>(this.backend_url + 'login', login).pipe(map(data => {
      this.localStorageService.store('authenticationToken', data.authenticationToken);
      this.localStorageService.store('username', data.username);
      return true;
    }));
  }

  isAuthenticated(): boolean{
    return this.localStorageService.retrieve('username') != null;
  }

  getUsername(): string{
    return this.localStorageService.retrieve('username');
  }
}
