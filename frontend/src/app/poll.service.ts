import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Poll } from './poll.models';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PollService {
  // handle the https request
  private baseUrl = 'http://localhost:8080/api/polls'

  constructor(private http: HttpClient) { }

  // create
  createPoll(poll: Poll): Observable<Poll> {
    return this.http.post<Poll>(this.baseUrl, poll);
  }

  //get
  getPolls(): Observable<Poll[]> {
    return this.http.get<Poll[]>(this.baseUrl)
  }


  //vote
  vote(pollId: number, optionIndex:number) : Observable<void> {
    const url = `${this.baseUrl}/vote`
    return this.http.post<void>(url, {pollId, optionIndex});
  }
}
