import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HyHComponent } from './hy-h.component';

describe('HyHComponent', () => {
  let component: HyHComponent;
  let fixture: ComponentFixture<HyHComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HyHComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HyHComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
